package com.nopal.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity () {

    var usernameInput : String = ""
    var passwordInput : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnSave.setOnClickListener {

            validasiInput()
        }

    }

    private fun validasiInput() {
        usernameInput = edtusername.text.toString()
        passwordInput = edtpassword.text.toString()

        when{

            usernameInput.isEmpty() -> edtusername.error = "Nama tidak boleh kosong"
            passwordInput.isEmpty() -> edtpassword.error = "Password tidak boleh kosong"

            else -> {

                tampilToast("Navigasi ke halaman login")
                navigasiKeProfilDiri()

            }
        }

    }

    private fun navigasiKeProfilDiri() {

        val intent = Intent(this, Main2Activity::class.java)

        val bundle = Bundle()
        bundle.putString("username", usernameInput)
        bundle.putString("password", passwordInput)

        intent.putExtras(bundle)

        startActivity(intent)

    }

    private fun tampilToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }


}
package com.nopal.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity (){

    var usernameInput: String = ""
    var passwordInput: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnSave2.setOnClickListener {
            validasiInput()
        }
    }

    private fun validasiInput() {
        usernameInput = edtName2.text.toString()
        passwordInput = edtPassword2.text.toString()

        when {

            usernameInput.isEmpty() -> edtName2.error = "username tidak boleh kosong"
            passwordInput.isEmpty() -> edtPassword2.error = "password tidak boleh kosong"

            else -> {

                tampilToast("masuk halaman login")
                navigasiKeProfilDiri()

            }
        }

    }

    private fun navigasiKeProfilDiri() {

        val intent = Intent(this, Main3Activity::class.java)

        val bundle = Bundle()
        bundle.putString("nama", usernameInput)
        bundle.putString("password", passwordInput)

        intent.putExtras(bundle)

        startActivity(intent)

    }

    private fun tampilToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

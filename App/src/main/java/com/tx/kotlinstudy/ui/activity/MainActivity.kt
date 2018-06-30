package com.tx.kotlinstudy.ui.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.tx.kotlinstudy.R
import com.tx.usercenter.ui.activity.RegisterActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startRegisterBtn.setOnClickListener{
//            var intent = Intent()
//            intent.setClass(this, RegisterActivity::class.java)
//            toast("注册！")
            Toast.makeText(this,"注册",Toast.LENGTH_SHORT).show()
        }
    }


}

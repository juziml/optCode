package com.opt.liba.utils

import android.content.Context
import android.widget.Toast

object LibAUtils {

    fun fileLog(){

    }

    fun showToast(context:Context,msg:String){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
    }
}
package com.ramanmatharu.calculator

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ramanmatharu.calculator.databinding.ActivityMainBinding
import com.ramanmatharu.calculator.databinding.ActivityMainBinding.inflate
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var exp : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.zeroBtn.setOnClickListener {
            if(binding.tvDisplay.text.toString().isEmpty() or (binding.tvDisplay.text.toString() == "0")){
                exp = "0"
                binding.tvDisplay.text = exp
            }
            else{
                exp = binding.tvDisplay.text.toString() + "0"
                binding.tvDisplay.text = exp
            }
        }

        binding.oneBtn.setOnClickListener {
           if(binding.tvDisplay.text.toString().isEmpty() or (binding.tvDisplay.text.toString() == "0")){
               exp = "1"
               binding.tvDisplay.text = exp
           }
            else{
                exp = binding.tvDisplay.text.toString() + "1"
               binding.tvDisplay.text = exp
           }
        }

        binding.twoBtn.setOnClickListener {
            if(binding.tvDisplay.text.toString().isEmpty() or (binding.tvDisplay.text.toString() == "0")){
                exp = "2"
                binding.tvDisplay.text = exp
            }
            else{
                exp = binding.tvDisplay.text.toString() + "2"
                binding.tvDisplay.text = exp
            }
        }

        binding.threeBtn.setOnClickListener {
            if(binding.tvDisplay.text.toString().isEmpty() or (binding.tvDisplay.text.toString() == "0")){
                exp = "3"
                binding.tvDisplay.text = exp
            }
            else{
                exp = binding.tvDisplay.text.toString() + "3"
                binding.tvDisplay.text = exp
            }
        }

        binding.fourBtn.setOnClickListener {
            if(binding.tvDisplay.text.toString().isEmpty() or (binding.tvDisplay.text.toString() == "0")){
                exp = "4"
                binding.tvDisplay.text = exp
            }
            else{
                exp = binding.tvDisplay.text.toString() + "4"
                binding.tvDisplay.text = exp
            }
        }

        binding.fiveBtn.setOnClickListener {
            if(binding.tvDisplay.text.toString().isEmpty() or (binding.tvDisplay.text.toString() == "0")){
                exp = "5"
                binding.tvDisplay.text = exp
            }
            else{
                exp = binding.tvDisplay.text.toString() + "5"
                binding.tvDisplay.text = exp
            }
        }

        binding.sixBtn.setOnClickListener {
            if(binding.tvDisplay.text.toString().isEmpty() or (binding.tvDisplay.text.toString() == "0")){
                exp = "6"
                binding.tvDisplay.text = exp
            }
            else{
                exp = binding.tvDisplay.text.toString() + "6"
                binding.tvDisplay.text = exp
            }
        }

        binding.sevenBtn.setOnClickListener {
            if(binding.tvDisplay.text.toString().isEmpty() or (binding.tvDisplay.text.toString() == "0")){
                exp = "7"
                binding.tvDisplay.text = exp
            }
            else{
                exp = binding.tvDisplay.text.toString() + "7"
                binding.tvDisplay.text = exp
            }
        }

        binding.eightBtn.setOnClickListener {
            if(binding.tvDisplay.text.toString().isEmpty() or (binding.tvDisplay.text.toString() == "0")){
                exp = "8"
                binding.tvDisplay.text = exp
            }
            else{
                exp = binding.tvDisplay.text.toString() + "8"
                binding.tvDisplay.text = exp
            }
        }

        binding.nineBtn.setOnClickListener {
            if(binding.tvDisplay.text.toString().isEmpty() or (binding.tvDisplay.text.toString() == "0")){
                exp = "9"
                binding.tvDisplay.text = exp
            }
            else{
                exp = binding.tvDisplay.text.toString() + "9"
                binding.tvDisplay.text = exp
            }
        }

        binding.dotBtn.setOnClickListener {
            exp = binding.tvDisplay.text.toString()
            binding.tvDisplay.text = "$exp."
        }

        binding.clearBtn.setOnClickListener {
            binding.tvDisplay.text = "0"

        }

        binding.removeBtn.setOnClickListener {
            binding.tvDisplay.text = binding.tvDisplay.text.toString().dropLast(1)
            if(binding.tvDisplay.text.toString().isEmpty()){
                binding.tvDisplay.text = "0"
            }
        }

        binding.addBtn.setOnClickListener {
            exp = binding.tvDisplay.text.toString()
            binding.tvDisplay.text = "$exp + "
        }

        binding.minusBtn.setOnClickListener {
            exp = binding.tvDisplay.text.toString()
            binding.tvDisplay.text = "$exp - "
        }

        binding.mulBtn.setOnClickListener {
            exp = binding.tvDisplay.text.toString()
            binding.tvDisplay.text = "$exp * "
        }

        binding.divBtn.setOnClickListener {
            exp = binding.tvDisplay.text.toString()
            binding.tvDisplay.text = "$exp / "
        }

        binding.percentBtn.setOnClickListener {
            exp = binding.tvDisplay.text.toString()
//            Log.d("exp",exp)
            var value = ExpressionBuilder("$exp / 100").build()
            var result = value.evaluate()
//            Log.d("value of value", result.toString())
            binding.tvDisplay.text = "${result.toString()}"
        }
        binding.equalBtn.setOnClickListener {
            endResult()
        }
    }

    private fun endResult() {
        var expression = ExpressionBuilder(binding.tvDisplay.text.toString()).build()
        var endResult = expression.evaluate()
        var decResult = endResult.toLong()

        if(endResult == decResult.toDouble()){
            binding.tvDisplay.text = decResult.toString()
        }else {
            binding.tvDisplay.text = endResult.toString()
        }
    }
}


//addBtn.setOnClickListener {
//    if(status == 0){
//        value = tvDisplay.text.toString().toInt()
//        tvDisplay.text = "0"
//        Log.d("value of value" , value.toString())
//        status = 1
//    }
//    else if(status == 1){
//        res = tvDisplay.text.toString().toInt()
//        tvDisplay.text = "0"
//        Log.d("value of result" ,res.toString())
//        res += value
//        status = 2
//        Log.d("value of res after addition", res.toString())
//    }
//    else if(status == 2){
//        res += tvDisplay.text.toString().toInt()
//        tvDisplay.text = "0"
//    }
//}
//minusBtn.setOnClickListener {
//    if(status == 0){
//        value = tvDisplay.text.toString().toInt()
//        tvDisplay.text = "0"
//        Log.d("value of value" , value.toString())
//        status = 1
//    }
//    else if(status == 1){
//        res = tvDisplay.text.toString().toInt()
//        tvDisplay.text = "0"
//        Log.d("value of result" ,res.toString())
//        value -= res
//        res = value
//        Log.d("value of res after sub", res.toString())
//    }
//}


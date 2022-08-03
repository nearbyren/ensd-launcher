package ejiayou.pay.module

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import ejiayou.common.module.mvvm.BaseBindActivity
import ejiayou.pay.module.databinding.PayMainActivityBinding

/**
 * @author: lr
 * @created on: 2022/7/16 4:42 下午
 * @description:
 */
class MainActivity : BaseBindActivity<PayMainActivityBinding>() {
    override fun initialize(savedInstanceState: Bundle?) {

        binding.payStart.setOnClickListener {
            startActivity(Intent(MainActivity@ this, PayEnsdActivity::class.java))

        }
    }

    override fun layoutRes(): Int {
        return R.layout.pay_main_activity
    }

    override fun layoutView(): View? {
        return null
    }

    override fun layoutViewGroup(): ViewGroup? {
        return null
    }

    override fun showEmptyView(isShow: Boolean) {
        TODO("Not yet implemented")
    }

    override fun showLoadingView(isShow: Boolean) {
        TODO("Not yet implemented")
    }
}
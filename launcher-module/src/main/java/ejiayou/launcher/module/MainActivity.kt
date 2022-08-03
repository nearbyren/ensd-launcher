package ejiayou.launcher.module

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import ejiayou.common.module.mvvm.BaseBindActivity
import ejiayou.launcher.module.databinding.LauncherMainActivityBinding

/**
 * @author: lr
 * @created on: 2022/7/16 4:42 下午
 * @description:
 */
class MainActivity : BaseBindActivity<LauncherMainActivityBinding>() {
    override fun initialize(savedInstanceState: Bundle?) {

        binding.launcherStart.setOnClickListener {

        }
    }

    override fun layoutRes(): Int {
        return R.layout.launcher_main_activity
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
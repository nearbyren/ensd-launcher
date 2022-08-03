package ejiayou.pay.module.dialog

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.view.isVisible
import ejiayou.common.module.utils.ToastUtils
import ejiayou.pay.module.R
import ejiayou.pay.module.databinding.PayEnsdPayingDialogBinding
import ejiayou.uikit.module.dialog.BaseBindDialogFragment
import kotlin.random.Random

/**
 * @author:
 * @created on: 2022/7/14 14:01
 * @description:
 */
class PayEnsdPayingDialog : BaseBindDialogFragment<PayEnsdPayingDialogBinding>() {
    override fun getLayoutId(): Int {
        return R.layout.pay_ensd_paying_dialog
    }


    override fun initialize(view: View, savedInstanceState: Bundle?) {
        val k = Random.nextInt(3)
        Log.d("TTT", " k = ${k}")
        when (k) {
            0 -> {
                //正在支付中
                binding.payLlInquire.isVisible = true

            }
            1 -> {
                //支付状态查询情况
                binding.payLlStatus.isVisible = true
                val k = Random.nextInt(2)
                if (k == 0) {
                    binding.payLlStatusText.text = "是否完成支付"
                } else {
                    binding.payLlStatusText.text = "没有查询到结果，若您已支付，支付金额将 在3个工作日内原路返回"
                }
                binding.payLlStatusPayCancel.setOnClickListener {
                    ToastUtils.showToast(requireContext(), "未支付 取消")
                }
                binding.payLlStatusPaidRefresh.setOnClickListener {
                    ToastUtils.showToast(requireContext(), "已支付 刷新")
                }
            }
            2 -> {
                //支付成功
                binding.paySuss.isVisible = true
                binding.paySussTvAmount.text = "${Random.nextInt(534)}"
                binding.paySussTvStationDescribe.text = "中石化麒麟加油站 丨 92# 丨4号枪"
                binding.paySussBtnFinish.setOnClickListener {
                    ToastUtils.showToast(requireContext(), "完成...")
                }

            }
        }


    }
}
package ejiayou.station.module.adapter

import ejiayou.pay.module.R
import ejiayou.pay.module.databinding.PayEnsdItemBinding
import ejiayou.pay.module.model.PayItemDto
import ejiayou.uikit.module.recyclerview.BaseBindRecyclerAdapter


/**
 * @author:
 * @created on: 2022/7/13 19:00
 * @description:支付订单
 */
class PayEnsdAdapter : BaseBindRecyclerAdapter<PayEnsdItemBinding, PayItemDto>() {

    override fun getLayoutId(viewType: Int): Int {
        return R.layout.pay_ensd_item
    }

    override fun onBindingItem(binding: PayEnsdItemBinding, item: PayItemDto, position: Int) {
        binding.payIvEplusIcon.setBackgroundResource(item.icon)
        binding.payTvEplusTitle.text = item.text
        if (item.isCheck) {
            binding.payIvEplusCheck.setBackgroundResource(R.drawable.pay_ensd_detail_eplus_select)
        } else {
            binding.payIvEplusCheck.setBackgroundResource(R.drawable.pay_ensd_detail_eplus_un_select)
        }

    }

}
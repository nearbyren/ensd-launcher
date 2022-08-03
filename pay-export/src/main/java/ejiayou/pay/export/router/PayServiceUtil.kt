package ejiayou.pay.export.router

import com.alibaba.android.arouter.launcher.ARouter
import ejiayou.pay.export.router.service.IPayService

/**
 * @author: lr
 * @created on: 2022/7/16 4:26 下午
 * @description: 提供启动activity  service 等动作
 */
open class PayServiceUtil {


    companion object {

        fun initService(): IPayService? {
            var service = ARouter.getInstance().build(PayRouterTable.PATH_SERVICE_PAY).navigation()
            if (service is IPayService)
                return service
            return null
        }


        fun navigatePayDetailPage() {
            ARouter.getInstance().build(PayRouterTable.PATH_PAY_UI_DETAIL)
                .navigation()

        }
        fun navigatePayTestPage() {
            ARouter.getInstance().build(PayRouterTable.PATH_PAY_UI_TEST)
                .withString("key1", "哈哈1")
                .withString("key2", "哈哈2")
                .navigation()

        }
    }
}
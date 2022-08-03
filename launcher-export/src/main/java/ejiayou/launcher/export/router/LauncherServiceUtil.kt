package ejiayou.launcher.export.router

import com.alibaba.android.arouter.launcher.ARouter
import ejiayou.launcher.export.router.service.ILauncherService

/**
 * @author: lr
 * @created on: 2022/7/16 4:26 下午
 * @description: 提供启动activity  service 等动作
 */
open class LauncherServiceUtil {


    companion object {

        fun initService(): ILauncherService? {
            var service = ARouter.getInstance().build(LauncherRouterTable.PATH_SERVICE_LAUNCHER).navigation()
            if (service is ILauncherService)
                return service
            return null
        }


        fun navigateLauncherDetailPage() {
            ARouter.getInstance().build(LauncherRouterTable.PATH_LAUNCHER_UI_DETAIL)
                .navigation()

        }
        fun navigateLauncherTestPage() {
            ARouter.getInstance().build(LauncherRouterTable.PATH_LAUNCHER_UI_TEST)
                .withString("key1", "哈哈1")
                .withString("key2", "哈哈2")
                .navigation()

        }
    }
}
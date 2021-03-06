package com.easyservice.service;
/**
 * 权限管理
 * @author wmsdu@aliyun.com
 *
 */
public interface IPermissionManager {
	/**
	 * 校验权限
	 * @param role 用户角色
	 * @param fetchServiceSdl 是否为获取服务定义
	 * @param applyService 用户申请访问的服务
	 * @param applyMethod 用户申请访问的服务方法
	 * @return 校验是否通过
	 */
	public boolean checkPermission(int role,boolean fetchServiceSdl,String applyService,String applyMethod);
}

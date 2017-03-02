package com.hk.util;

import java.util.ArrayList;
import java.util.List;

import com.hk.bean.Mainsupplydep;
import com.hk.bean.Senddocs;


/**
 * 字段分解
 * 
 * @author xuda
 * 
 */
public class GetDepartBeanHelper {
	/**
	 * 得到主送部門的信息
	 * 
	 * @param doc
	 * @param id
	 * @return
	 */
	public static List<Mainsupplydep> getMainSupplyDepBean(
			Senddocs doc) {

		List<Mainsupplydep> list = new ArrayList<Mainsupplydep>();

			String[] getDeptName=doc.getFmainsupplydep().split(",");
			String[] getDeptId = doc.getFmainsupplydepid().split(",");
			for (int i = 0; i < getDeptId.length; i++) {
				Mainsupplydep mainSupplyDepBean = new Mainsupplydep();
				mainSupplyDepBean.setFdeptcode("");
				mainSupplyDepBean.setFdeptname(getDeptName[i]);
				mainSupplyDepBean.setFdeptid(getDeptId[i]);
				mainSupplyDepBean.setFsendfileid(doc.getId());
				mainSupplyDepBean.setIsdel("0");
				list.add(mainSupplyDepBean);
			}
		return list;
	}
	/**
	 * 得到抄送部門的信息
	 */
	/**
	 * 得到会签人的信息
	 */
}

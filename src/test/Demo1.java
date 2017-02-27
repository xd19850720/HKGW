package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hk.bean.EmployeeQuery;
import com.hk.service.DepartmentService;
import com.hk.service.EmployeeService;
import com.hk.service.PositionService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:com/hk/config/spring/applicationContext.xml" })
public class Demo1 {

	@Autowired
	@Qualifier("departmentService")
	private DepartmentService departmentService;
	@Autowired
	@Qualifier("positionService")
	private PositionService positionService;
	@Autowired
	@Qualifier("employeeService")
	private EmployeeService employeeService;

	@Test
	// 增加测试数据
	public void test1() {
		// 增加1公司
		// DepartmentQuery department = new DepartmentQuery();
		// department.setCompanyid(1);
		// department.setCompanyname("HK");
		// department.setDepartmentcode("2");
		// department.setDepartmentname("职教部");
		// department.setIsdel("0");
		// departmentService.add(department);

		// 增加3职位
		// PositionQuery position1 = new PositionQuery();
		// position1.setPositioncode("0001");
		// position1.setPositionname("教学总监");
		// position1.setDeptid(1);
		// PositionQuery position2 = new PositionQuery();
		// position2.setPositioncode("0002");
		// position2.setPositionname("教学主管");
		// position2.setDeptid(1);
		// PositionQuery position3 = new PositionQuery();
		// position3.setPositioncode("0003");
		// position3.setPositionname("讲师");
		// position3.setDeptid(1);
		// positionService.add(position1);
		// positionService.add(position2);
		// positionService.add(position3);

		// 增加50个员工
		for (int i = 0; i < 50; i++) {
			EmployeeQuery employee = new EmployeeQuery();
			employee.setEmployeecode((i + 1) + "");
			employee.setEmployeename("xuda" + i);
			if (i % 2 == 0) {
				employee.setSex(0);
			} else {
				employee.setSex(1);
			}
			if (i == 0) {
				employee.setPositionid(1);
			} else if (i <= 5) {
				employee.setPositionid(2);
			} else {
				employee.setPositionid(3);
			}
			employee.setTel("1812345678");
			employee.setMail("byytcat@163.com");
			employeeService.add(employee);
		}

	}

	// @Test
	// public void test2() {
	// System.out.println(employeeService.getEmployees(1, 10));
	// }

	@Test
	public void test3() {
		Integer number = Integer.parseInt("0001");
		System.out.println(number);
	}

	@Test
	public void test4() {
		EmployeeQuery query = new EmployeeQuery();
		query.setEmployeename("ceshi1234567");
		query.setSex(1);
		query.setAge(18);
		query.setPositionid(2);
		query.setTel("123456");
		query.setMail("byytcat@163.com");
		employeeService.add(query);
	}

	@Test
	public void test5() {
		EmployeeQuery query = new EmployeeQuery();
		List<Integer> ids = new ArrayList<Integer>();
		// ids.add(2);
		// ids.add(3);
		ids.add(4);
		// query.setIds(ids);
		employeeService.deleleEmployees(ids);
	}
	//
	// @Test
	// public void test6() {
	// EmployeeQuery query = new EmployeeQuery();
	// // query.setEmployeecode("HK0068");
	// query.setPositionid(2);
	// List<EmployeeQuery> querys = employeeService
	// .getEmployeesByConditions(query);
	// System.out.println(querys);
	// }
}

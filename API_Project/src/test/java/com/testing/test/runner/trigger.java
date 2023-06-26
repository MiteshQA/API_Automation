package com.testing.test.runner;

import java.io.IOException;

import com.testing.test.testscripts.TestCase01_Postrequest;
import com.testing.test.testscripts.TestCase02_GetAllrequest;
import com.testing.test.testscripts.TestCase03_GetParticularrequest;
import com.testing.test.testscripts.TestCase04_DeleteParticularrequest;
import com.testing.test.testscripts.TestCase05_PutParticularrequest;
import com.testing.test.testscripts.TestCase06_Patchrequest;

public class trigger {

	public static void main(String[] args) throws IOException {

		TestCase01_Postrequest tc01 = new TestCase01_Postrequest();
		tc01.postRequest();
		TestCase02_GetAllrequest tc02 = new TestCase02_GetAllrequest();
		tc02.GetAlldata();
		TestCase03_GetParticularrequest tc03 = new TestCase03_GetParticularrequest();
		tc03.getParticularreq();
		TestCase04_DeleteParticularrequest tc04 = new TestCase04_DeleteParticularrequest();
		tc04.deleteParticularData();
		TestCase05_PutParticularrequest tc05 = new TestCase05_PutParticularrequest();
		tc05.updateParticularData();
		TestCase06_Patchrequest tc06 = new TestCase06_Patchrequest();
		tc06.patchRequest();

	}

}

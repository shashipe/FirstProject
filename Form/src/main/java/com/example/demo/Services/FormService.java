package com.example.demo.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Beans.Form;
import com.example.demo.Beans.Response;
import com.example.demo.Dao.FormDao;
import com.example.demo.Entity.FormDetails;

@Service
public class FormService {
@Autowired FormDao formDao;
	public void save(FormDetails formDetails) {
		formDao.save(formDetails);
	}

	public void update(String id, String changeValue, FormDetails form) {
		Optional<FormDetails> formDetails=formDao.findById(id);
		if(formDetails.isPresent())
		{
		form.setId(changeValue);
		}
		
		formDao.save(form);
	}
	

	

}

package com.hk.controller.convertor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class MyDateConvertor implements Converter<String, Date> {
	@Override
	public Date convert(String date) {
		try {
			if (date != null && !date.equals("")) {
				return new SimpleDateFormat("yyyy-MM-dd").parse(date);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}

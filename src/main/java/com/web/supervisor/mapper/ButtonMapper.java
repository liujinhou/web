package com.web.supervisor.mapper;

import java.util.List;

import com.web.base.mapper.BaseMapper;
import com.web.supervisor.entity.Button;

public interface ButtonMapper extends BaseMapper {
    
	List<Button>  listButton();  
	
}
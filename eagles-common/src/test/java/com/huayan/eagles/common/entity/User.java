package com.huayan.eagles.common.entity;

import lombok.Data;

/**
 * @author caihua
 * @version 1.0
 * @date 2020/4/7
 */
@Data
public class User {
	private Long id;
	private String name;
	private Integer age;
	private String email;
}
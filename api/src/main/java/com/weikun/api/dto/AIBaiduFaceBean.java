package com.weikun.api.dto;

import lombok.Data;

import java.util.List;

/**
 * 人脸搜索返回的JSON对应的JavaBean
 * @author weikun
 *
 */
@Data
public class AIBaiduFaceBean {
	private String log_id;
	private String error_msg;
	private String error_code;
	private String cached;
	private String timestamp;
	private Result result;

	@Data
	public static class Result{
		private String face_token;
		private List<UserList> user_list;

	}
	@Data
	public static class UserList{
		private float score;
		private String group_id;
		private String user_id;
		private String user_info;

	}
}

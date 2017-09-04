package com.xwintop.xJavaFxTool.controller.debugTools.redisTool;

import java.net.URL;
import java.util.ResourceBundle;

import com.xwintop.xJavaFxTool.view.debugTools.redisTool.RedisToolDataTableView;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Getter
@Setter
@Log4j
public class RedisToolDataTableController extends RedisToolDataTableView {
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initView();
		initEvent();
		initService();
	}

	private void initView() {
	}

	private void initEvent() {
	}

	private void initService() {
	}
}
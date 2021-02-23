<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ include file="../includes/header.jsp" %>

<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">보드 가입</h1>
	</div>
</div>

<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			
			<div class="panel-heading">보드 가이이이입</div>
			<div class="panel-body">
				<form role="form" action="/board/register" method="post">
					<div class="form-group">
						<label>표</label> <input class="form-control" name='title'>
					</div>
					
					<div class="form-group">
						<label>텍스트 지역</label>
						<textarea class="form-control" rows="3" name='content'></textarea>
					</div>
					
					<div class="form-group">
						<label>글쓴이</label>
						<input class="form-control" name='writer'>
					</div>
					
					<button type="submit" class="btn btn-default">글쓰기 버튼</button>
					<button type="reset" class="btn btn-default">리셋 버튼</button>
				</form>
			</div>
		</div>
	</div>
</div>

<%@include file="../includes/footer.jsp" %>
<%--
  Created by IntelliJ IDEA.
  User: zhangliuna
  Date: 2019/3/20
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品列表页面</title>
    <style>
        .container{
            text-align: center;
            width: 750px;
            height: 360px;
            margin: 0px auto;
        }
    </style>
    <script>
        function pageNav(currPageNo) {
            document.getElementById("myform").currentPageNo.value=currPageNo;
            document.getElementById("myform").submit();
        }
        function submitForm() {
            document.getElementById("myform").submit();
        }
    </script>
</head>
<body>
    <div class="container">
        <form id="myform">
      <span>请选择商品分类</span>
        <select name="sortId" onchange="submitForm()">
           <option value="0">全部</option>
            <c:forEach var="goods" items="${sortList}">
              <option value="${goods.id}">${goods.name}</option>
            </c:forEach>
        </select>
            <input type="hidden" name="currentPageNo" value="1">
        </form>
        <table border="1">
            <tr>
                <th>商品编号</th>
                <th>商品名称</th>
                <th>商品分类</th>
                <th>产地</th>
                <th>生产日期</th>
                <th>单价（元）</th>
                <th>剩余数量</th>
                <th>购买 </th>
            </tr>
            <c:forEach var="detail" items="${goodsDetails}">
                <tr>
                    <td>${detail.id}</td>
                    <td>${detail.name}</td>
                    <td>${detail.address}</td>
                    <td>${detail.price}</td>
                    <td>${detail.cerateDate}</td>
                    <td>${detail.remaining}</td>
                    <td>购买</td>
                </tr>
            </c:forEach>
        </table>
        <div id="page">
            <a href="javascript:pageNav(${page.currentPageNo})">首页</a>
            <a href="javascript:pageNav(${page.currentPageNo - 1})">上一页</a>
            <a href="javascript:pageNav(${page.currentPageNo + 1})">下一页</a>
            <a href="javascript:pageNav(${page.totalPageCount})">末页</a>
            <span>第${page.currentPageNo}页/共${page.totalPageCount}页</span>
        </div>
    </div>
</body>
</html>

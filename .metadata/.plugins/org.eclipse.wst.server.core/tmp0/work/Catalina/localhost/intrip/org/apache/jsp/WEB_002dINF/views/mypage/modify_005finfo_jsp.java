/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-08-23 12:57:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.mypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modify_005finfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1661158901181L));
    _jspx_dependants.put("jar:file:/D:/workspace-spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/People-in-Trip/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../resources/css/mypage/mypage.css\">\r\n");
      out.write("	<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Raleway:wght@600&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet'>\r\n");
      out.write("    <title>회원 정보 수정</title>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("    	function change_pwd() {\r\n");
      out.write("    		let pass = document.getElementById('input_pass').value;\r\n");
      out.write("    		let pass2 = document.getElementById('input_pass2').value;\r\n");
      out.write("			if(document.modify_info._pwd.value == \"\") {\r\n");
      out.write("				alert(\"비밀번호를 입력해주세요\");\r\n");
      out.write("				document.modify_info._pwd.focus();\r\n");
      out.write("				return false;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			if(pass.length < 8 || pass.length>16) {\r\n");
      out.write("				alert('비밀번호는 8글자 이상, 16글자 이하만 사용 가능합니다.');\r\n");
      out.write("				document.modify_info._pwd.focus();\r\n");
      out.write("				return false;\r\n");
      out.write("			} \r\n");
      out.write("			\r\n");
      out.write("			if(document.modify_info._pwd.value != document.modify_info.pwd.value) {\r\n");
      out.write("				alert(\"비밀번호를 다시 확인해주세요\");\r\n");
      out.write("				document.modify_info.pwd.focus();\r\n");
      out.write("				return false;\r\n");
      out.write("			} else {\r\n");
      out.write("				alert(\"비밀번호변경 완료!\");\r\n");
      out.write("				document.modify_info.action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/mypage/update_modify_info\";\r\n");
      out.write("				document.modify_info.method=\"post\";\r\n");
      out.write("				document.modify_info.submit();\r\n");
      out.write("			} \r\n");
      out.write("		}\r\n");
      out.write("    	function checkNick_Nm() {\r\n");
      out.write("    		\r\n");
      out.write("     		let specialCheck = /[`~!@#$%^&*|\\\\\\'\\\";:\\/?]/gi;\r\n");
      out.write("    		\r\n");
      out.write("    		// 닉네임 입력값을 가져온다\r\n");
      out.write("    		let nick_nm = document.getElementById('input_nick').value;\r\n");
      out.write("    		nick_nm = nick_nm.toUpperCase();\r\n");
      out.write("    		let nickLength = 0;\r\n");
      out.write("    		\r\n");
      out.write("    		// 한글, 영문 길이 2,1로 바꾸기\r\n");
      out.write("    		// 한글은 2, 영문은 1로 치환한다\r\n");
      out.write("    		for (var i = 0; i < nick_nm.length; i++) {\r\n");
      out.write("    			// chartAt은 String 타입 객체를 char타입으로 변환한다. \r\n");
      out.write("    			nick = nick_nm.charAt(i);\r\n");
      out.write("    			\r\n");
      out.write("    			// escape() 함수는 charAt을 통해 받아온 char을 16진수로 바꿔주며 쿠키충돌을 피한다. 한글은 이 길이가 4 넘는다.\r\n");
      out.write("    			if(escape(nick).length > 4) {\r\n");
      out.write("    				nickLength += 2;\r\n");
      out.write("    			} else {\r\n");
      out.write("    				nickLength += 1;\r\n");
      out.write("    			}\r\n");
      out.write("    		}\r\n");
      out.write("    		\r\n");
      out.write("    		// 닉네임 필수 입력\r\n");
      out.write("    		if (nick_nm == null || nick_nm == \"\") {\r\n");
      out.write("    			alert(\"닉네임을 입력해 주세요.\");\r\n");
      out.write("    			document.modify_info.focus();\r\n");
      out.write("    			return false;\r\n");
      out.write("    		} \r\n");
      out.write("    		// 닉네임 빈칸 포함 안됨\r\n");
      out.write("    		else if (nick_nm.search(/\\s/) != -1) {\r\n");
      out.write("    			alert(\"닉네임은 빈 칸을 포함 할 수 없습니다.\");\r\n");
      out.write("    			return false;\r\n");
      out.write("    		}\r\n");
      out.write("    		// 닉네임 한글 3~10자, 영문 및 숫자 6 ~ 20자\r\n");
      out.write("    		else if (nickLength < 6 || nickLength > 20) {\r\n");
      out.write("    			alert(\"닉네임은 한글 3~10자, 영문 및 숫자 6~20자 까지 가능합니다.\");\r\n");
      out.write("    			return false;\r\n");
      out.write("    		}\r\n");
      out.write("    		// 닉네임 특수문자 포함 안됨 test()는 정규식과 특정 문자열 사이의 일치에 대한 검색을 수행, 일치 true, 불일치 false 반환\r\n");
      out.write("    		else if (specialCheck.test(nick_nm)) {\r\n");
      out.write("    			alert(\"닉네임은 특수문자를 포함 할 수 없습니다.\");\r\n");
      out.write("    			return false;\r\n");
      out.write("    		} else {\r\n");
      out.write("    			$.ajax({\r\n");
      out.write("    				url : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/mypage/selectNickChk\" ,\r\n");
      out.write("    				type : \"post\" ,\r\n");
      out.write("    				dataType: \"JSON\" ,\r\n");
      out.write("    				data : {\"nick_nm\" : nick_nm} ,\r\n");
      out.write("    				success : function(result) {\r\n");
      out.write("    					if(result != 1) {\r\n");
      out.write("    						alert(\"사용 가능한 닉네임 입니다.\");\r\n");
      out.write("    						chkNick_Btn.style.display = 'none';\r\n");
      out.write("    						sucNick_Btn.style.display = 'block';\r\n");
      out.write("    					} \r\n");
      out.write("    					else if(result == 1) {\r\n");
      out.write("    						alert(\"중복된 닉네임입니다.\");\r\n");
      out.write("    					}\r\n");
      out.write("    				} ,\r\n");
      out.write("    				error : function(err) {\r\n");
      out.write("    					alert(\"중복된 아이디입니다.\");\r\n");
      out.write("    				}\r\n");
      out.write("    			});\r\n");
      out.write("    		}\r\n");
      out.write("    	}\r\n");
      out.write("    	\r\n");
      out.write("    	function successNick_Nm() {\r\n");
      out.write("			alert(\"닉네임 변경이 완료되었습니다!\");\r\n");
      out.write("			document.modify_info.action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/mypage/update_mypage_nick_nm\";\r\n");
      out.write("			document.modify_info.method=\"post\";\r\n");
      out.write("			document.modify_info.submit();\r\n");
      out.write("		}\r\n");
      out.write("    	\r\n");
      out.write("    	function success_modify() {\r\n");
      out.write("    		alert(\"수정이 완료되었습니다!\");\r\n");
      out.write("			document.modify_info.action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/mypage/mypage_renewal\";\r\n");
      out.write("			document.modify_info.method=\"post\";\r\n");
      out.write("			document.modify_info.submit();\r\n");
      out.write("		}\r\n");
      out.write("    	\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <header>\r\n");
      out.write("        <p class=\"p1\">회원 정보 수정</p>\r\n");
      out.write("    </header>\r\n");
      out.write("    <section>\r\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/mypage/update_modify_info\", method=\"post\" name=\"modify_info\">\r\n");
      out.write("            <table id=\"main_table2\" border=\"1\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"table2_td1\"><strong>아이디</strong></td>\r\n");
      out.write("                    <td class=\"table2_td2\">\r\n");
      out.write("                        <input type=\"text\" id=\"input_id\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"  />\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td class=\"table2_td3\"></td>\r\n");
      out.write("                    <td class=\"table2_td4\" colspan=\"2\"><span>아이디는 변경할 수 없습니다.</span></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"table2_td1\"><strong>이름</strong></td>\r\n");
      out.write("                    <td class=\"table2_td2\">\r\n");
      out.write("                    	<input type=\"text\" id=\"input_name\" name=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td class=\"table2_td3\"></td>\r\n");
      out.write("                    <td class=\"table2_td4\" id=\"table2_nameinput\" colspan=\"3\">\r\n");
      out.write("                        <span>주민등록상 실명을 입력해주세요.</span>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"table2_td1\"><strong>비밀번호</strong></td>\r\n");
      out.write("                    <td class=\"table2_td2\">\r\n");
      out.write("                        <input type=\"password\" id=\"input_pass\" name=\"_pwd\" />\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td class=\"table2_td3\"></td>\r\n");
      out.write("                    <td class=\"table2_td4\" id=\"table2_tr2_td4\" colspan=\"3\">\r\n");
      out.write("                        <span>영문, 숫자, 특수문자를 조합하여<br/> 8~20자 이내로 입력하세요.</span>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"table2_td1\"><strong>비밀번호 <br/> 확인</strong></td>\r\n");
      out.write("                    <td class=\"table2_td2\">\r\n");
      out.write("                        <input type=\"password\" id=\"input_pass2\" name=\"pwd\" />\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td class=\"table2_td3\"><button class=\"t2_btn\" type=\"button\" onclick=\"change_pwd()\">비밀번호 변경</button></td>\r\n");
      out.write("                    <td class=\"table2_td3\"></td>\r\n");
      out.write("                    <td class=\"table2_td4\" colspan=\"3\"><span id=\"hiddenspan_pass2\">&nbsp;</span></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"table2_td1\"><strong>닉네임</strong></td>\r\n");
      out.write("                    <td class=\"table2_td2\">\r\n");
      out.write("                        <input type=\"text\" id=\"input_nick\" name=\"nick_nm\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.nick_nm }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" /><div id=\"hiddendiv_nick\"></div>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td class=\"table2_td3\">\r\n");
      out.write("                    	<button class=\"t2_btn\" type=\"button\" onclick=\"checkNick_Nm()\" id=\"chkNick_Btn\">중복<br/>확인</button>\r\n");
      out.write("                    	<button class=\"t2_btn\" type=\"button\" onclick=\"successNick_Nm()\" id=\"sucNick_Btn\">닉네임<br/>변경</button>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td class=\"table2_td4\" id=\"input_not3\" colspan=\"2\">\r\n");
      out.write("                        <span>한글, 영문, 숫자 사용이 가능합니다. <br/> 6~20자 이내로 입력하세요. <br/> 한글은 최대 10자까지 입력 가능합니다.</span>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("                <tr id=\"email_tr\">\r\n");
      out.write("                    <td class=\"table2_td1\"><strong>이메일</strong></td>\r\n");
      out.write("                    <td id=\"table2_mtd1\">\r\n");
      out.write("                        <div class=\"hiddendiv_email_sub\">&nbsp;</div>\r\n");
      out.write("                        <input class=\"mailinput\" id=\"mailinput1\" name=\"mailinput1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\"/>\r\n");
      out.write("                        <div class=\"hiddendiv_email\">&nbsp;</div>\r\n");
      out.write("                    </td>\r\n");
      out.write("\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr id=\"last_tr\">\r\n");
      out.write("                    <td colspan=\"5\">\r\n");
      out.write("                        <button class=\"t2_btn\" id=\"submit_btn\" type=\"button\" onclick=\"success_modify()\">수정하기</button>\r\n");
      out.write("                        <!-- <input type=\"reset\" value=\"다시 작성\" /> -->\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </form>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/mypage/modify_info.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("contextPath");
      // /WEB-INF/views/mypage/modify_info.jsp(4,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/mypage/modify_info.jsp(4,0) '${pageContext.request.contextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
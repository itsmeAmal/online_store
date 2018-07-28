<%-- 
    Document   : index
    Created on : May 24, 2015, 9:01:11 AM
    Author     : AMA Wickramarathna
--%>

<%@page import="ifix.sessionCart.CartItem"%>
<%@page import="java.util.List"%>
<%@page import="ifix.sessionCart.cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Products | iFix</title>
    </head>
    <body>
        <div>
            <div></div>
            <div></div>
            <div></div>
            <div></div>
            <div></div>
            <div></div>
            <div></div>
            <div></div>
        </div>
        
        
        
        
        
        
        
        
        
    <center>
        <h1>~~~ Shopping Cart ~~~</h1>
        <form action="addProduct">
            <table>
                <tr>
                    <td>Product ID</td>
                    <td><input type="text" name="pid"/></td>
                </tr>
                <tr>

                    <td>Product Name</td>
                    <td><input type="text" name="pname"/></td>

                </tr>
                <tr>

                    <td>Unit Price</td>
                    <td><input type="text" name="up"/></td>

                </tr>
                <tr>
                    <td>Quantity</td>
                    <td><input type="text" name="qty"/></td>
                </tr>

                <tr>
                    <td>
                        <input type="submit" value="Add to Cart"/>
                    </td>
                </tr>

            </table>    
        </form>
        <%
            HttpSession hs = request.getSession();
            //out.print(hs.getAttribute("myCart") == null);
            if (hs.getAttribute("myCart") != null) {

        %>
        ~~~ View Shopping Cart ~~~

        <table border="1" width="600">
            <tr>
                <td>Product ID</td>
                <td>Product Name</td>
                <td>Quantity</td>
                <td>Unit Price</td>
                <td>Total</td>
                <td>Remove</td>
            </tr>
            <%  cart c = (cart) hs.getAttribute("myCart");
                //cast kara cart item ekakata, mkada methana attribute eka object ekak widiyata ena nisa, cart kiyanne cart type kenek nisa
                List<CartItem> citems = c.getOld_citems();
                // me list variable eke thamai values tika thiyanne
                double tot = 0;

                for (CartItem ci : citems) {
                    //ci.getPid();
                    //ci.getPname();
                    //ci.getQty();
                    //ci.getUprice();
                    //ci.getQty() * ci.getUprice();
                    tot += ci.getQty() * ci.getUprice();


            %>
            <%
            %>

            <form action="removeProduct">
                <tr>
                    <td><%=ci.getPid()%></td>
                    <td><%=ci.getPname()%></td>
                    <td><%=ci.getQty()%></td>
                    <td><%=ci.getUprice()%></td>
                    <td><%=ci.getQty() * ci.getUprice()%></td>
                    <td><input type="submit" value="Remove"></td>
                </tr>

                <input type="hidden"  name="pid" value="<%=ci.getPid()%>"/>



            </form>
            <% }%>
        </table>
        Your total balance is : <%=tot%>

        <%
            }
        %>
        <h1>
        </h1>
    </center>
</body>
</html>

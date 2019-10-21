Set-Up and Instructions


Front-end
* Click on shopping.html in the “website” folder.
* Shopping_html contains html files and images.
* The headers, “home, register, login, shopping cart, and wish list” do not actually direct you to anything. And neither does search.
* .Java files contains all back-end content


MySQL Tables
* Products
   * “productId” (Columns)
   * “name”
   * “price”
   * “description”
   * “fabricType”
   * “size”
   * “color”
   * “rating”
* ShoppingCart
   * “id”
   * “userId”
   * “productId”
* USERS
   * “Id”
   * “Username”
   * “Password”
* WishList
   * “id”
   * “userId”
   * “productId”
Back-end
* /registerUser
   * For registering user, I went inside postman used a POST method. I would go into the body section and type in “username”: username”, “password”: “password”
   * You can register your own username and password.
* /login
   * For logging in a user, I went inside postman and used a GET method. The parameters it accepted were username (key) and password (value).
   * Message
* /validateToken
   * For validating token, I went inside postman and used username (key) and token given in /login (value).
* /search
   * For searching a product, I went inside postman and used a GET method. The parameters were search (key) and productName (value).
* /addToWishList
   * For adding to WishList, I went inside postman and used a POST method. The parameters were username (key) and productName (value).
   * You can check “userId” in MySQL database.
* /showWishList
   * For showing WishList, I went inside postman and used a GET method. The parameters were “userId” (key) and user’s actual ID (value).
   * Message should show productId, price, and name of product.
* /addToShoppingCart
   * Similar process of adding to wish list.
* /showShoppingCart
   * Similar process of showing wish list.
* /MoveToShoppingCart
   * For moving to shopping cart, I I went inside postman and used a POST method. The parameters were username (key) and productName (value).
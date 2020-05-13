<%-- 
    Document   : menu
    Created on : Apr 16, 2020, 7:10:31 PM
    Author     : user
--%>

<div class="container">
    <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
        <!-- Brand-->
        <a class="navbar-brand" href="#">Logo</a>
        <!-- Links -->
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="/njt/app/user/all">All users</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/njt/app/user/add">Add user</a>
            </li>
            <!-- Dropdown -->
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbardrop" role="button" data-toggle="dropdown">
                    Profile
                </a>
                <div class="dropdown-menu">
                    <a class="dropdown-item" href="#">My Profile</a>
                    <a class="dropdown-item" href="/njt/app/logout">Logout</a>
                </div>
            </li>
        </ul>
    </nav>
    Login as:${sessionScope.loginUser.username}
</div>


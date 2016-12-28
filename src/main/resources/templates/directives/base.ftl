<#macro base>

<!doctype html>
<html class="no-js" lang="en">
<head>
	<meta charset="utf-8"/>
	<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
	<title>${title} « IGJam.eu</title>

	<link rel="stylesheet" href="/css/foundation.min.css"/>
	<link rel="stylesheet" href="/css/layout.css"/>
	<link rel="stylesheet" href="/css/navi.css"/>
	<link rel="stylesheet" href="/css/texte.css"/>
	<link rel="stylesheet" href="/css/contentelemente.css"/>
	<link rel="stylesheet" href="/css/gamescom.css"/>

	<script src="/js/vendor/modernizr.js"></script>
	<script src="/js/vendor/jquery.js"></script>

	<link rel="icon" href="img/gamescom/favicon.ico" type="image/x-icon">
${head}
</head>
<body>
<!-- Header Start -->
<section id="header">
	<div class="row">
		<div class="small-6 columns">
			<!-- Header text -->
		</div>

		<div class="small-6 columns right">
			<!-- Login -->
			<#if session.isAnonymous()>
				<a href="${springMacroRequestContext.getContextUrl("/login")}" class="button login">Login</a>

				<p class="logout_headline">&nbsp;</p>
			<#else>
				<#if session.getUser().hasInvitations()>
					<a href="${springMacroRequestContext.getContextUrl("/invitations")}" class="button login">${session.getUser().getInvitations().size()}
						<i class="icon-envelope"></i></a>
				</#if>
				<a href="${springMacroRequestContext.getContextUrl("/profile")}" class="button login" id="account">
					<img class="avatar" src="${session.getUser().getAvatar()}" width="16" height="16"/>
				${session.getUser.getUsername()}
					<br/>
				</a>

				<p class="logout_headline"><a href="${springMacroRequestContext.getContextUrl("/logout")}">Logout</a></p>
			</#if>
			<!-- Follow us on -->
			<p class="socialmedia_headline">Follow us on</p>
			<ul class="socialmedia">
				<li class="facebook"><a href="https://www.facebook.com/InnoGames/" target="_blank"></a></li>
				<li class="youtube show-for-medium-up"><a href="https://www.youtube.com/user/InnoGames" target="_blank"></a></li>
				<li class="twitter"><a href="https://twitter.com/InnoGames" target="_blank"></a></li>
			</ul>
		</div>
	</div>
</section>
<!-- Header Stop -->

<nav class="row hide-for-large-up">
	<div class="icon-bar five-up">
		<a class="item" href="${springMacroRequestContext.getContextUrl("/")}"><label>Home</label></a></li>
		<a class="item" href="${springMacroRequestContext.getContextUrl("/news")}"><label>News</label></a>
		<a class="item" href="${springMacroRequestContext.getContextUrl("/rules")}"><label>Rules</label></a>
		<a class="item" href="${springMacroRequestContext.getContextUrl("/faq")}"><label>FAQ</label></a>
		<a class="item" href="${springMacroRequestContext.getContextUrl("/about")}"><label>About</label></a>
	</div>
</nav>

<!-- Navi Start -->
<nav class="row show-for-large-up">
	<div class="row">
		<div class="large-12 columns nav-content">
			<ul class="main_menu">
				<#if springMacroRequestContext.getContextPath() == "">
					<li class="active"><a href="${springMacroRequestContext.getContextUrl("/")}">Home</a></li>
				<#else>
					<li><a href="${springMacroRequestContext.getContextUrl("/")}">Home</a></li>
				</#if>

				<#if springMacroRequestContext.getContextPath() == "/news">
					<li class="active"><a href="${springMacroRequestContext.getContextUrl("/news")}">News</a></li>
				<#else>
					<li><a href="${springMacroRequestContext.getContextUrl("/news")}">News</a></li>
				</#if>

				<#if springMacroRequestContext.getContextPath() == "/rules">
					<li class="active"><a href="${springMacroRequestContext.getContextUrl("/rules")}">Rules</a></li>
				<#else>
					<li><a href="${springMacroRequestContext.getContextUrl("/rules")}">Rules</a></li>
				</#if>

				<#if springMacroRequestContext.getContextPath() == "/faq">
					<li class="active"><a href="${springMacroRequestContext.getContextUrl("/faq")}">FAQ</a></li>
				<#else>
					<li><a href="${springMacroRequestContext.getContextUrl("/faq")}">FAQ</a></li>
				</#if>

				<#if springMacroRequestContext.getContextPath() == "/jams">
					<li class="active"><a href="${springMacroRequestContext.getContextUrl("/jams")}">Game Jams</a></li>
				<#else>
					<li><a href="${springMacroRequestContext.getContextUrl("/jams")}">Game Jams</a></li>
				</#if>

				<#if springMacroRequestContext.getContextPath() == "/games">
					<li class="active"><a href="${springMacroRequestContext.getContextUrl("/games")}">Games</a></li>
				<#else>
					<li><a href="${springMacroRequestContext.getContextUrl("/games")}">Games</a></li>
				</#if>

				<#if springMacroRequestContext.getContextPath() == "/gamescom">
					<li class="active"><a href="${springMacroRequestContext.getContextUrl("/gamescom")}">Gamescom</a></li>
				<#else>
					<li><a href="${springMacroRequestContext.getContextUrl("/gamescom")}">Gamescom</a></li>
				</#if>

				<#if springMacroRequestContext.getContextPath() == "/about">
					<li class="active"><a href="${springMacroRequestContext.getContextUrl("/about")}">About</a></li>
				<#else>
					<li><a href="${springMacroRequestContext.getContextUrl("/about")}">About</a></li>
				</#if>
			</ul>
		</div>
	</div>
</nav>
<!-- Navi Stop -->

<!-- Content Start -->
<section id="content">
	<span class="show-for-large-up">
	${breadcumb}
			</span>
	<#list session.getFlashMessages() as message>
		<div class="row" style="margin-top:5px;">
			<div class="large-12 columns">
				<div data-alert class="alert-box success radius">
				${message.getMessage()}
				</div>
			</div>
		</div>
	</#list>

	<div class="content row">
		<#nested>
	${content}
	</div>
</section>
<!-- Content Stop -->

{% include "footer.html" %}

<script src="/js/foundation.min.js"></script>
<script>
	$(document).foundation();
</script>
</body>
</html>

</#macro>

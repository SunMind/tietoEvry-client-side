<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Guide</title>

	<!-- Reference Bootstrap files -->
	<link rel="stylesheet"
		  href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>

	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>

<body>

		<div>

			<div id="loginbox" style="margin-top: 50px;"
				 class="mainbox col-md-3 col-md-offset-2 col-sm-6 col-sm-offset-2">

				<div class="panel panel-info">

					<div class="panel-heading">
						<div class="panel-title">Hiking Guide</div>
					</div>
	
		<form:form action="saveChoice" modelAttribute="choice"  method="POST">

			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />

					<div style="padding-top: 30px" class="panel-body">

					<div class="form-group">
						<label>Distance</label>
						<form:input path="distance" type="number" min="1" class="form-control" placeholder="from 1 to infinity"/>
					</div>

						<div class="form-group">
							<label>Season</label>
							<form:select path="season" class="form-control">
								<form:option value="Summer" label="Summer"/>
								<form:option value="Autumn" label="Autumn"/>
								<form:option value="Winter" label="Winter"/>
								<form:option value="Spring" label="Spring"/>
							</form:select>
						</div>

						<div class="form-group">
							<label>Relief</label>
							<form:select path="relief" class="form-control">
								<form:option value="Mountains" label="Mountains"/>
								<form:option value="Plains" label="Plains"/>
							</form:select>
						</div>

						<label></label>
						<input type="submit" value="Get advice" class="save" />
					</div>
		</form:form>

				</div>
			</div>
		</div>
</body>

</html>











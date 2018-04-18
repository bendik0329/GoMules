<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>

<%-- 
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/rideposting.css">
 --%>
<t:dashboard>
	<!-- 	<link
		href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css"
		rel='stylesheet' type='text/css'> -->

	<link rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/rideposting.css">

	<link rel="stylesheet"
		href="${pageContext.request.contextPath}/webjars/font-awesome/4.4.0/css/font-awesome.min.css">
	<div>
		<div class="panel panel-default panel-table">
			<div class="panel-heading">
				<div class="row">
					<div class="col col-xs-8">
						<h3 class="panel-title">Rides Available</h3>
					</div>

					<div class="col col-xs-3 text-right">
						<input id="searchRide" name="searchRide"
							placeholder="Search a ride" class="form-control" type="text"
							value="">
					</div>

					<div class="col col-xs-1 text-right">
						<button type="button" class="btn btn-sm btn-primary btn-create">Search</button>
					</div>
				</div>
			</div>
			<div class="panel-body">
				<table class="table table-striped table-bordered table-list">
					<thead>
						<tr>
							<th><em class="fa fa-cog" ></em></th>
							<th class="hidden-xs">ID</th>
							<th>Name</th>
							<th>Email</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td align="center"><a class="btn btn-danger" data-title="Edit" data-toggle="modal" data-target="#edit">
									<em class="fa fa-car"></em>
							</a>
							</td>
							<td class="hidden-xs">1</td>
							<td>John Doe</td>
							<td>johndoe@example.com</td>
						</tr>
					</tbody>
				</table>

			</div>
			<div class="panel-footer">
				<div class="row"></div>
			</div>
		</div>
	</div>
	
<!-- 	Modal starts from here. -->
	
	<div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true" style="display: none;">
      <div class="modal-dialog">
    <div class="modal-content">
          <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
        <h4 class="modal-title custom_align" id="Heading">Edit Your Detail</h4>
      </div>
          <div class="modal-body">
          <div class="form-group">
        <input class="form-control " type="text" placeholder="blah">
        </div>
        <div class="form-group">
        
        <input class="form-control " type="text" placeholder="blah">
        </div>
        <div class="form-group">
        <textarea rows="2" class="form-control" placeholder=" Blah"></textarea>
    
        
        </div>
      </div>
          <div class="modal-footer ">
        <button type="button" class="btn btn-warning btn-lg" style="width: 100%;"><span class="glyphicon glyphicon-ok-sign"></span>&nbsp;Update</button>
      </div>
        </div>
    <!-- /.modal-content --> 
  </div>
      <!-- /.modal-dialog --> 
    </div>
<!--     Modal ends here -->
</t:dashboard>



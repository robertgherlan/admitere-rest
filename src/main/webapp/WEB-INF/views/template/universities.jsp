<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="panel panel-default" id="universities-container">
	<div class="panel-heading">
		<h4 class="panel-title">Universities</h4>
		<div class="heading-elements">
			<button type="button" ui-sref=".add()"
				class="btn btn-primary heading-btn">
				<i class="icon-plus3 position-left"></i> Add new university
			</button>
		</div>
	</div>
	<div class="panel-body">
		<div class="row" ng-if="universitiesFound">
			<!-- Include search form -->
			<span ng-include src="'include/search.html'"></span>

			<table class="table table-responsive table-hover">
				<thead>
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<tr ng-repeat="university in universities">
						<td>{{university.id}}</td>
						<td>{{university.name}}</td>
						<td>
							<div class="btn-group">
								<button type="button"
									ui-sref=".detail({universityId: university.id})"
									class="btn btn-primary btn-icon">
									<i class="icon-info3"></i>
								</button>
							</div>
						</td>
					</tr>
				</tbody>
			</table>

			<span ng-include src="'include/pagination.html'"></span>
		</div>

		<div class="row" ng-if="!universitiesFound">
			<span ng-include src="'no-data-found.html'"></span>
		</div>
	</div>
</div>
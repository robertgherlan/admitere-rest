<div class="cg-notify-message"
	ng-class="[$classes, 
    $position === 'center' ? 'cg-notify-message-center' : '',
    $position === 'left' ? 'cg-notify-message-left' : '',
    $position === 'right' ? 'cg-notify-message-right' : '']"
	ng-style="{'margin-left': $centerMargin}">

	<div ng-show="!$messageTemplate">{{$message}}</div>

	<div ng-show="$messageTemplate" class="cg-notify-message-template">

	</div>

	<button type="button" class="cg-notify-close" ng-click="$close()">
		<span aria-hidden="true">&times;</span> <span
			class="cg-notify-sr-only">Close</span>
	</button>

</div>
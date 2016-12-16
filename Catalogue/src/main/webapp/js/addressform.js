$(document).ready(function() {
		$('a.address-window').click(function() {

			// Getting the variable's value from a link 
			var addressBox = $(this).attr('href');
			
			//Fade in the Popup and add close button
			$(addressBox).fadeIn(300);
			
			//Set the center alignment padding + border
			var popMargTop = ($(addressBox).height() + 24) / 2;
			var popMargLeft = ($(addressBox).width() + 24) / 2;
			
			$(addressBox).css({
				'margin-top' : -popMargTop,
				'margin-left' : -popMargLeft
			});
			
			// Add the mask to body
			$('body').append('<div id="mask"></div>');
			$('#mask').fadeIn(300);

			return false;
		});

		// When clicking on the button close or the mask layer the popup closed
		$('a.close, #mask').live('click', function() {
			$('#mask , .address-popup').fadeOut(300, function() {
				$('#mask').remove();
			});
			
			return false;
		});
	});
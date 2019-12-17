$(document).ready(function(){
	

$(function(){
	$('form[id="ownerForm"]').validate({
		  rules: {
		    firstName: 'required',
		    lastName: 'required',
		    emailId: {
		      required: true,
		      email: true,
		    },
		    mobileNumber: {
		      required: true,
		      minlength: 10,
		    }
		  },
		  messages: {
			  firstName: 'First Name is Mandatory',
			  lastName: 'Last Name is Mandatory',
			  emailId: 'Enter a valid email',
			  mobileNumber: {
				  required: 'Mobile Number is Mandatory',
		      minlength: 'Mobile Number must be at least 10 digits long'
		    }
		  },
		  submitHandler: function(form) {
		    form.submit();
		  }
		});
   });
});


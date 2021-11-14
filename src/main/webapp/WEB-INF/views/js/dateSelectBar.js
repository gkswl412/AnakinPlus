//jQuery datepicker UI
//체크인,체크아웃 date 모두 오늘날짜 이후로만 선택 가능하다.
//체크인(from) date 선택시 체크아웃(to) date의 minDate(=선택 가능한 가장 빠른 날짜)는 체크인 date의 현재 value 값이 된다.
//체크아웃(to) date 선택시 체크인(from) date의 maxDate(=선택 가능한 가장 늦은 날짜)는 체크아웃 date의 현재 value 값이 된다.  
$(function() {
	var dateFormat = "yy-mm-dd",
		from = $( "#from" )
        .datepicker({
		  	dateFormat: "yy-mm-dd",
		  	minDate: 0,
			buttonImage: "images/icon/Calendar-icon.png",
			buttonImageOnly: true,
			showMonthAfterYear: true,
			showOn: "both",
			showOtherMonths: true, 
			monthNames: ["1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"],
			dayNames: ["월","화","수","목","금","토","일"]
        })
        .on( "change", function() {
          	to.datepicker( "option", "minDate", getDate(this));
        }),
      	to = $( "#to" ).datepicker({
			dateFormat: "yy-mm-dd",
			minDate:1,
			buttonImage: "images/icon/Calendar-icon.png",
			buttonImageOnly: true,
			showMonthAfterYear: true,
			showOn: "both",
			showOtherMonths: true, 
			monthNames: ["1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"],
			dayNamesMin: ["일","월","화","수","목","금","토"]
      	})
      	.on( "change", function() {
        	from.datepicker( "option", "maxDate", getDate(this));
      	});
 
	function getDate( element ) {
      	var date;
      	try {
        	date = $.datepicker.parseDate( dateFormat, element.value );
      	} catch( error ) {
        	date = null;
      	}
      	return date;
    }

});


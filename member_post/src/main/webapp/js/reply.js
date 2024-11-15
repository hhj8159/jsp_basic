// const replyService = {};
const replyService = (function() {
    const url = "/member_post/reply";

    function write(reply, callback) {
        console.log(reply);
		if(callback)
			callback();
    }
    function list(pno, callback) {
        $.getJSON(url + "/list/" + pno).done(function(data) {
            if(callback)
			callback(data);
        });
        
        
        // 위와 동일코드
        // $.ajax({
        //     url : rul + "/list/" + pno,
        //     method : 'GET',
        //     dataType : 'JSON',
        //     success : function(data) {
        //         console.log(data);
                
        //     }
        // });

    }
    return {write, list}
})();

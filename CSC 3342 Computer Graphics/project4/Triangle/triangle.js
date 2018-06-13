var gl;
var points;
var theta = 0.01;
var thetaLoc;
var dot = 0.01;
var delay = 100;

window.onload = function init(){
    var canvas = document.getElementById( "gl-canvas" );
     gl = WebGLUtils.setupWebGL( canvas );    
     if ( !gl ) {
	 alert( "WebGL isn't available" );
    }        
// Three Vertices        
var vertices = [ 
vec2( -0.125, 0.125 ),
vec2(  -0.125, -0.125 ),
vec2(  0.125, 0.125 ),
vec2(0.125,-0.125 )];

//  Configure WebGL   
gl.viewport( 0, 0, canvas.width, canvas.height ); //0, 0, canvas.width, canvas.height
gl.clearColor( 1.0, 1.0, 0.0, 1.0 );  // 1.0, 1.0, 1.0, 1.0
     
//  Load shaders and initialize attribute buffers
var program = initShaders( gl, "vertex-shader", "fragment-shader" );
 gl.useProgram( program );        
 thetaLoc=gl.getUniformLocation(program, "theta");
// Load the data into the GPU        
    var bufferId = gl.createBuffer();
    gl.bindBuffer( gl.ARRAY_BUFFER, bufferId );
    gl.bufferData( gl.ARRAY_BUFFER, flatten(vertices), gl.STATIC_DRAW ); 

// Associate out shader variables with our data buffer
      var vPosition = gl.getAttribLocation( program, "vPosition" );
      gl.vertexAttribPointer( vPosition, 2, gl.FLOAT, false, 0, 0 );
      gl.enableVertexAttribArray( vPosition );    
      render();
};
function render() {
	
	setTimeout( function(){
		 gl.clear( gl.COLOR_BUFFER_BIT ); 
		 if(theta > .875)
		 {
			 dot =-0.01;
		 }
		 
		 if(theta<-.875)
		 {
			 dot=0.01;
		 }
		 theta+=dot;
		 requestAnimFrame(render);
		 gl.uniform1f(thetaLoc, theta);
		 gl.drawArrays(gl.TRIANGLE_STRIP, 0,4 );
	},delay);
}   

function sum() {
	var numero1 = parseFloat(document.getElementById('numero1').value);
	var numero2 = parseFloat(document.getElementById('numero2').value);
	var resultado = numero1 + numero2;

	document.getElementById('resultado').value = resultado;
}

function numero(n1) {
	return n1 * n1;
}

function hola(n1, n2) {
	return n1 * n2
}

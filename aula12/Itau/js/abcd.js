function resultado(){
    let vlr = document.getElementById("input_valor").value;
    alert(vlr);
    console.log('Log -> ' + vlr);
 
    //var vlrf = vlr.toLocaleString('pt-br',{style: 'currency', currency: 'BRL'});
    //var vlrf = vlr.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });
    //var vlrf = vlr.toLocaleString('pt-br', {minimumFractionDigits: 2});

    //var vlrf = vlr.toLocaleString('en')  ;
    //var vlrf = format(vlr);

    var vlrf = parseInt(vlr).toLocaleString();   

    //console.log(vlrf.toLocaleString()); 

    console.log('Log -> ' + vlrf);


    document.getElementById("resultado").innerHTML  = "<p>Hi <b>" + vlr +" ==> " + vlrf ;

}


function llenarCombo(combo, lista) {
    combo.empty();
    for (var i = 0; i < lista.length; i++) {
        var item = "<option value='" + lista[i].code + "'>" + lista[i].label + "</option>";
        combo.append(item);
    }
}
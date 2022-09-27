Public Class Form1

    Dim intEntrega = 0
    Dim intResta = 1000

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Shown
        While intResta - intEntrega >= 200
            Dim strCodigo = InputBox("Introduzca el número de uds entragadas", "Dato entrega", intEntrega)
            intEntrega = Convert.ToInt32(strCodigo) + intEntrega
        End While
        final.Text = "El inventario a bajado de 200 uds. Debe comunicarlo"
    End Sub
End Class

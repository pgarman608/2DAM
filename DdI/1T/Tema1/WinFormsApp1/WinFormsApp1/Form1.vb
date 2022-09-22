Public Class Form1

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim respuesta
        respuesta = MsgBox("¿Estas seguro?", vbYesNo, "Cancelar")
        If respuesta = vbYes Then
            MsgBox("Le has dado a yes")
        End If
    End Sub
End Class

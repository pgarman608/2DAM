Imports System.Threading

Public Class Form1
    Private Sub Form1_Shown(sender As Object, e As EventArgs) Handles Me.Shown
        For numCamions = 1 To 20
            Dim capCamions = InputBox("Introduzca la capacidad del camion", "")
            prueba.Text = capCamions
            While capCamions >= 0
                Dim saca = InputBox("Introduzca el tamaño de la saca n")
            End While
        Next
    End Sub
End Class

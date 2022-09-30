Imports System.Threading

Public Class Form1
    Private Sub Form1_Shown(sender As Object, e As EventArgs) Handles Me.Shown
        Dim ix As Integer = 0
        For index As Integer = ix To 5
            Dim capCamn As Integer
            Do While capCamn < 18000 Or capCamn > 28000
                capCamn = InputBox("Introduzca la capacidad del camion nº" & (ix + 1).ToString, "Datos capacidad")
                If capCamn >= 18000 And capCamn <= 28000 Then
                    ix = ix + 1
                    Dim saca As Integer
                    Dim Capaux As Integer
                    Dim numSaca As Integer = 1
                    Do While saca <= 3000 Or saca >= 9000 And capCamn - Capaux > 2999
                        saca = InputBox("Introduzca la capacidad del saca nº" + numSaca.ToString, "Datos capacidad", Capaux)
                        If saca >= 3000 And saca <= 9000 Then
                            If capCamn - Capaux > 2999 Then
                                Capaux = Capaux + saca
                                numSaca += 1
                            Else
                                MsgBox("Esa cantidad de saca no entra")
                            End If
                        Else
                            MsgBox("El tamaño de la saca deberia de estar entre 3000 y 9000")
                        End If
                    Loop
                    If index = 20 Then
                        MsgBox("Camion lleno, fin de la jornada")
                    Else
                        capCamn = 0
                        saca = 0
                        Capaux = 0
                        MsgBox("Camion lleno, pase al siguiente")
                    End If
                Else
                    MsgBox("Numero introducido deberia ser entre 18000 y 28000")
                End If
            Loop

        Next
    End Sub

End Class

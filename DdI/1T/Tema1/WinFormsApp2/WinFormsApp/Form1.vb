Public Class Form1
    Private Sub Form1_Shown(sender As Object, e As EventArgs) Handles Me.Shown
        Dim ix As Integer = 0
        For ix = 1 To 20
            Dim capCamn As Integer = 0
            Do While capCamn < 18000 Or capCamn > 28000
                capCamn = InputBox("Introduzca la capacidad del camion nº" & ix.ToString, "Datos capacidad", )
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
                    If ix = 20 Then
                        MsgBox("Camion lleno, fin de la jornada")
                    Else
                        saca = 0
                        capCamn = 0
                        Capaux = 0
                        MsgBox("Camion lleno, pase al siguiente")
                    End If
                Else
                    MsgBox("Numero introducido deberia ser entre 18000 y 28000")
                End If
            Loop
            lfin.Text = "Finalizada la carga del dia"
        Next
    End Sub
End Class

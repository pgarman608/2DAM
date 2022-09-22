Public Class Form1
    Dim backc As New Random
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Me.BackColor = Color.FromArgb(255, backc.Next(255), backc.Next(255), backc.Next(255))
    End Sub
End Class

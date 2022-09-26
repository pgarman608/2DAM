Public Class Form1


    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim backc As New Random
        BackColor = Color.FromArgb(255, backc.Next(255), backc.Next(255), backc.Next(255))
    End Sub

    Private Sub btnST_Click(sender As Object, e As EventArgs) Handles btnST.Click
        If 0 < (move1.Top - 10) Then
            move1.Top -= 10
        End If

    End Sub

    Private Sub btnIT_Click(sender As Object, e As EventArgs) Handles btnIT.Click
        If 0 < (move1.Left - 10) Then

            move1.Left -= 10

        End If
    End Sub

    Private Sub btnBT_Click(sender As Object, e As EventArgs) Handles btnBT.Click
        If Me.Size.Height - (move1.Size.Height + 30) >= (move1.Top + 10) Then

            move1.Top += 10

        End If
    End Sub

    Private Sub btnDT_Click(sender As Object, e As EventArgs) Handles btnDT.Click
        If Me.Size.Width - (move1.Size.Width + 30) >= (move1.Left + 10) Then

            move1.Left += 10

        End If
    End Sub

    Private Sub Button8_Click(sender As Object, e As EventArgs) Handles btnSP.Click
        If 0 < (Me.Top - 10) Then

            Me.Location = New Point(Me.Location.X, Me.Location.Y + 10)

        End If
    End Sub

    Private Sub Button7_Click(sender As Object, e As EventArgs) Handles btnDP.Click
        If Screen.PrimaryScreen.Bounds.Width > ((Me.Location.X + Me.Width) + 10) Then

            Me.Location = New Point(Me.Location.X + 10, Me.Location.Y)

        End If
    End Sub

    Private Sub Button6_Click(sender As Object, e As EventArgs) Handles btnBP.Click
        If Screen.PrimaryScreen.Bounds.Height > ((Me.Location.Y + Me.Height) + 10) Then

            Me.Location = New Point(Me.Location.X, Me.Location.Y + 10)

        End If
    End Sub

    Private Sub Button9_Click(sender As Object, e As EventArgs) Handles btnIP.Click
        If 0 < (Me.Left - 10) Then

            Me.Location = New Point(Me.Location.X - 10, Me.Location.Y)

        End If
    End Sub
End Class

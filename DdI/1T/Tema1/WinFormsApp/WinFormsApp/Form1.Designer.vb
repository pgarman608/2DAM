<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()>
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Me.Button1 = New System.Windows.Forms.Button()
        Me.FileSystemWatcher1 = New System.IO.FileSystemWatcher()
        Me.btnIT = New System.Windows.Forms.Button()
        Me.btnST = New System.Windows.Forms.Button()
        Me.btnDT = New System.Windows.Forms.Button()
        Me.btnBT = New System.Windows.Forms.Button()
        Me.btnBP = New System.Windows.Forms.Button()
        Me.btnDP = New System.Windows.Forms.Button()
        Me.btnSP = New System.Windows.Forms.Button()
        Me.btnIP = New System.Windows.Forms.Button()
        Me.move1 = New System.Windows.Forms.TextBox()
        CType(Me.FileSystemWatcher1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'Button1
        '
        Me.Button1.Location = New System.Drawing.Point(335, 225)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(75, 23)
        Me.Button1.TabIndex = 0
        Me.Button1.Text = "&Color"
        Me.Button1.UseVisualStyleBackColor = True
        '
        'FileSystemWatcher1
        '
        Me.FileSystemWatcher1.EnableRaisingEvents = True
        Me.FileSystemWatcher1.SynchronizingObject = Me
        '
        'btnIT
        '
        Me.btnIT.Location = New System.Drawing.Point(78, 157)
        Me.btnIT.Name = "btnIT"
        Me.btnIT.Size = New System.Drawing.Size(75, 23)
        Me.btnIT.TabIndex = 1
        Me.btnIT.Text = "Izquierda T"
        Me.btnIT.UseVisualStyleBackColor = True
        '
        'btnST
        '
        Me.btnST.AccessibleName = "btnST"
        Me.btnST.Location = New System.Drawing.Point(150, 128)
        Me.btnST.Name = "btnST"
        Me.btnST.Size = New System.Drawing.Size(75, 23)
        Me.btnST.TabIndex = 2
        Me.btnST.Text = "Subir T"
        Me.btnST.UseVisualStyleBackColor = True
        '
        'btnDT
        '
        Me.btnDT.Location = New System.Drawing.Point(223, 157)
        Me.btnDT.Name = "btnDT"
        Me.btnDT.Size = New System.Drawing.Size(75, 23)
        Me.btnDT.TabIndex = 3
        Me.btnDT.Text = "Derecha T"
        Me.btnDT.UseVisualStyleBackColor = True
        '
        'btnBT
        '
        Me.btnBT.Location = New System.Drawing.Point(150, 186)
        Me.btnBT.Name = "btnBT"
        Me.btnBT.Size = New System.Drawing.Size(75, 23)
        Me.btnBT.TabIndex = 4
        Me.btnBT.Text = "Bajar T"
        Me.btnBT.UseVisualStyleBackColor = True
        '
        'btnBP
        '
        Me.btnBP.Location = New System.Drawing.Point(510, 186)
        Me.btnBP.Name = "btnBP"
        Me.btnBP.Size = New System.Drawing.Size(75, 23)
        Me.btnBP.TabIndex = 8
        Me.btnBP.Text = "Bajar P"
        Me.btnBP.UseVisualStyleBackColor = True
        '
        'btnDP
        '
        Me.btnDP.Location = New System.Drawing.Point(583, 157)
        Me.btnDP.Name = "btnDP"
        Me.btnDP.Size = New System.Drawing.Size(75, 23)
        Me.btnDP.TabIndex = 7
        Me.btnDP.Text = "Derecha P"
        Me.btnDP.UseVisualStyleBackColor = True
        '
        'btnSP
        '
        Me.btnSP.Location = New System.Drawing.Point(510, 128)
        Me.btnSP.Name = "btnSP"
        Me.btnSP.Size = New System.Drawing.Size(75, 23)
        Me.btnSP.TabIndex = 6
        Me.btnSP.Text = "Subir P"
        Me.btnSP.UseVisualStyleBackColor = True
        '
        'btnIP
        '
        Me.btnIP.Location = New System.Drawing.Point(438, 157)
        Me.btnIP.Name = "btnIP"
        Me.btnIP.Size = New System.Drawing.Size(75, 23)
        Me.btnIP.TabIndex = 5
        Me.btnIP.Text = "Izquierda P"
        Me.btnIP.UseVisualStyleBackColor = True
        '
        'move1
        '
        Me.move1.Location = New System.Drawing.Point(319, 52)
        Me.move1.Name = "move1"
        Me.move1.Size = New System.Drawing.Size(100, 23)
        Me.move1.TabIndex = 9
        Me.move1.Text = "Moveme"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(7.0!, 15.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(784, 361)
        Me.Controls.Add(Me.move1)
        Me.Controls.Add(Me.btnBP)
        Me.Controls.Add(Me.btnDP)
        Me.Controls.Add(Me.btnSP)
        Me.Controls.Add(Me.btnIP)
        Me.Controls.Add(Me.btnBT)
        Me.Controls.Add(Me.btnDT)
        Me.Controls.Add(Me.btnST)
        Me.Controls.Add(Me.btnIT)
        Me.Controls.Add(Me.Button1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        CType(Me.FileSystemWatcher1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents Button1 As Button
    Friend WithEvents FileSystemWatcher1 As IO.FileSystemWatcher
    Friend WithEvents btnBT As Button
    Friend WithEvents btnDT As Button
    Friend WithEvents btnST As Button
    Friend WithEvents btnIT As Button
    Friend WithEvents btnBP As Button
    Friend WithEvents btnDP As Button
    Friend WithEvents btnSP As Button
    Friend WithEvents btnIP As Button
    Friend WithEvents move1 As TextBox
End Class

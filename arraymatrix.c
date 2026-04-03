void main()
{
    int a[10][10],b[10][10],c[10][10],i,j,row,column;
    printf("Enter a row:");
    scanf ("% d",&row);
    printf("Enter a column:");
    scanf("%d",&column);

    printf("Enter 1st Matrix:");
    for(i=0;i<row;i++)
    {
        for(j=0;j<column;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }

    printf("Enter 2nd Matrix:");
    for(i=0;i<row;i++)
    {
        for(j=0;j<column;j++)
        {
            scanf("%d",&b[i][j]);
        }
    }

    for(i=0;i<row;i++)
    {
        for(j=0;j<column;j++)
        {
            c [i] [j]=a [i] [j]+b [i] [j];
        }
    }

    printf("Addition of 2 matrices:\n");
    for(i=0;i<row;i++)
    {
        for(j=0;j<column;j++)
        {
            printf(" %d",c [i] [j]);
        }
     printf("\n");
    }
    getch();
}

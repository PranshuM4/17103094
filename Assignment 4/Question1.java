package com.company;

import java.util.Scanner;
import java.util.*;

class Question1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine(); // So that next input is from next line

        String[] fasal = new String[n];
        int i=0;
        while (i<n)
        {
            fasal[i]=in.nextLine().trim();
            i++;
        }
        char[][] matrix_fasal = new char[n][m];
        i=0;
        while(i<n)
        {
            int j =0;
            while(j<m)
            {
                matrix_fasal[i][j] = fasal[i].charAt(j);
                j++;
            }
            i++;
        }
        char[] types_of_crops = new char[26];
        char r='a';
        while (r<'z') {
            types_of_crops[r-'a'] = r;
            r++;
        }

        System.out.println(replant(matrix_fasal,0, 0, n, m, 0, n*m, types_of_crops));
    }

    public static int replant(char[][] matrix_fasal, int present_row, int present_column, int n, int m, int count, int count_minimum, char[] crop_types)
    {
        Set<Character> up_left = new HashSet<>();

        if(present_row!=0)
            up_left.add(matrix_fasal[present_row - 1][present_column]);
        if(present_column!=0)
            up_left.add(matrix_fasal[present_row][present_column - 1]);

        Set<Character> down_right = new HashSet<>();

        if(present_row!=n-1)
            down_right.add(matrix_fasal[present_row + 1][present_column]);
        if(present_column!=m-1)
            down_right.add(matrix_fasal[present_row][present_column + 1]);

        boolean present_up_left = false;

        if(up_left.contains(matrix_fasal[present_row][present_column]))
            present_up_left = true;

        char[][] matrix_fasal_1 = new char[n][m];
        if(down_right.contains(matrix_fasal[present_row][present_column]))
        {
            if(present_up_left)
            {
                int k=0;
                while (k<26) {
                    if(!up_left.contains(crop_types[k]) && !down_right.contains(crop_types[k]))
                    {
                        int i=0;
                        while (i<n) {
                            int j=0;
                            while (j<m) {
                                matrix_fasal_1[i][j] = matrix_fasal[i][j];
                                j++;
                            }
                            i++;
                        }
                        matrix_fasal_1[present_row][present_column] = crop_types[k];
                        if(present_column<m-1)
                            count_minimum = Math.min(count_minimum, replant(matrix_fasal_1, present_row, present_column + 1, n, m, count + 1, count_minimum, crop_types));
                        else {
                            if (present_row < n - 1) {
                                count_minimum = Math.min(count_minimum, replant(matrix_fasal_1, present_row + 1, 0, n, m, count + 1, count_minimum, crop_types));
                            } else {
                                return Math.min(count + 1, count_minimum);
                            }
                        }
                        break;
                    }
                    k++;
                }
            }
            else
            {
                if(present_column<m-1)
                    count_minimum = Math.min(count_minimum, replant(matrix_fasal, present_row, present_column + 1, n, m, count, count_minimum, crop_types));
                else {
                    if (present_row < n - 1) {
                        count_minimum = Math.min(count_minimum, replant(matrix_fasal, present_row + 1, 0, n, m, count, count_minimum, crop_types));
                    } else {
                        return Math.min(count, count_minimum);
                    }
                }
                int k=0;
                while (k<26) {
                    if(!up_left.contains(crop_types[k]) && !down_right.contains(crop_types[k]))
                    {
                        int i=0;
                        while(i<n)
                        {
                            int j=0;
                            while (j<m)
                            {
                                matrix_fasal_1[i][j] = matrix_fasal[i][j];
                                j++;
                            }
                            i++;
                        }
                        matrix_fasal_1[present_row][present_column] = crop_types[k];
                        if(present_column<m-1)
                            count_minimum = Math.min(count_minimum, replant(matrix_fasal_1, present_row, present_column + 1, n, m, count + 1, count_minimum, crop_types));
                        else {
                            if (present_row < n - 1) {
                                count_minimum = Math.min(count_minimum, replant(matrix_fasal_1, present_row + 1, 0, n, m, count + 1, count_minimum, crop_types));
                            } else {
                                return Math.min(count + 1, count_minimum);
                            }
                        }
                        break;
                    }
                    k++;
                }

            }
        }
        else
        {
            if(present_up_left)
            {
                int k=0;
                while (k<26) {
                    if(!up_left.contains(crop_types[k]) && !down_right.contains(crop_types[k]))
                    {
                        int i =0;
                        while(i<n)
                        {
                            int j=0;
                            while (j<m)
                            {
                                matrix_fasal_1[i][j] = matrix_fasal[i][j];
                                j++;
                            }
                            i++;
                        }
                        matrix_fasal_1[present_row][present_column] = crop_types[k];
                        if(present_column<m-1)
                            count_minimum = Math.min(count_minimum, replant(matrix_fasal_1, present_row, present_column + 1, n, m, count + 1, count_minimum, crop_types));
                        else {
                            if (present_row < n - 1)
                                count_minimum = Math.min(count_minimum, replant(matrix_fasal_1, present_row + 1, 0, n, m, count + 1, count_minimum, crop_types));
                            else {
                                return Math.min(count + 1, count_minimum);
                            }
                        }
                        break;
                    }
                    k++;
                }
            }
            else
            {
                if(present_column<m-1)
                    count_minimum = Math.min(count_minimum, replant(matrix_fasal, present_row, present_column + 1, n, m, count, count_minimum, crop_types));
                else {
                    if (present_row < n - 1) {
                        count_minimum = Math.min(count_minimum, replant(matrix_fasal, present_row + 1, 0, n, m, count, count_minimum, crop_types));
                    } else {
                        return Math.min(count, count_minimum);
                    }
                }
            }
        }
        return count_minimum;
    }
}
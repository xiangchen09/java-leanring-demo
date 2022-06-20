package com.leetcodeproblem.testing;

import java.util.HashMap;

// zero, one, two, three, four, five, six, seven, eight, nine
//{e:9, o:4, n:4, i:4, t:3, r:3, h:2, f:2, v:2, s:2, w:1, u:1, x:1, g:1, z:1}

public class ReconstructOriginalDigitsfromEnglish {
    public String originalDigits(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        String all = "abcdefghijklmnopqrstuvwxyz";
        for (char c: all.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0));
        }
        for (char c: s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        System.out.println(count);

        int[] freq = new int[10];
        freq[0] = count.get('z');
        freq[2] = count.get('w');
        freq[4] = count.get('u');
        freq[6] = count.get('x');
        freq[8] = count.get('g');
        freq[7] = count.get('s') - freq[6];
        freq[5] = count.get('v') - freq[7];
        freq[3] = count.get('h') - freq[8];
        freq[9] = count.get('i') - freq[5] - freq[6] - freq[8];
        freq[1] = count.get('n') - freq[7] - 2 * freq[9];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < freq[i]; j++) {
                sb.append(i);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ReconstructOriginalDigitsfromEnglish rs = new ReconstructOriginalDigitsfromEnglish();
        String s= "owoztneoer";
        String result = rs.originalDigits(s);
        System.out.println(result);
    }
}

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val a = mutableMapOf<Char,Int>().withDefault { 0 }
        val b = mutableMapOf<Char,Int>().withDefault { 0 }
        
        
        for (i in s.indices) {
            a[s[i]] = a.getValue(s[i])+1
            b[t[i]] = b.getValue(t[i])+1
        }

        return a == b

    }
}

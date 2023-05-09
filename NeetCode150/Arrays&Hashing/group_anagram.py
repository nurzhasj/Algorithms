class Solution(object):
    def groupAnagrams(self, strs):
        res = []
        map = {}

        for str in strs:
            sorted_str = ''.join(sorted(str.lower()))

            if sorted_str in map:
                map[sorted_str].append(str)
            else:
                map[sorted_str] = [str]
        
        for val in map.values():
            res.append(val)
        
        return res

final class SlidingWindowTemplate {
    static int longestValidWindow(int[] nums) {
        int left = 0;
        int answer = 0;

        for (int right = 0; right < nums.length; right++) {
            // Add nums[right] to the window state.
            while (isWindowInvalid()) {
                // Remove nums[left] from the window state.
                left++;
            }
            answer = Math.max(answer, right - left + 1);
        }
        return answer;
    }

    private static boolean isWindowInvalid() {
        // Replace with the problem-specific validity condition.
        return false;
    }
}

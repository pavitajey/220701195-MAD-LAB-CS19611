fun sendEmail(context: Context) {
  val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", email@example.com, null))
  emailIntent.putExtra(Intent.EXTRA_SUBJECT, context.getString(R.string.label_subject_email))
  emailIntent.putExtra(Intent.EXTRA_TEXT, context.getString(R.string.label_email_description))
  startActivity(Intent.createChooser(emailIntent, context.getString(R.string.label_send_email))

}